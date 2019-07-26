// clone pairs:460:73%
// 286:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/utils/POJOUtils.java

public class Nicad_t1_beam_2nd19
{
    public ByteCodeAppender appender(final Target implementationTarget) {
      return (methodVisitor, implementationContext, instrumentedMethod) -> {
        // this + method parameters.
        int numLocals = 1 + instrumentedMethod.getParameters().size();

        // Create the POJO class.
        ForLoadedType loadedType = new ForLoadedType(pojoClass);
        StackManipulation stackManipulation =
            new StackManipulation.Compound(
                TypeCreation.of(loadedType),
                Duplication.SINGLE,
                MethodInvocation.invoke(
                    loadedType
                        .getDeclaredMethods()
                        .filter(
                            ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0)))
                        .getOnly()));

        // The types in the POJO might be the types returned by Beam's Row class,
        // so we have to convert the types used by Beam's Row class.
        ConvertType convertType = new ConvertType(true);
        for (int i = 0; i < fields.size(); ++i) {
          Field field = fields.get(i);

          ForLoadedType convertedType =
              new ForLoadedType((Class) convertType.convert(TypeDescriptor.of(field.getType())));

          // The instruction to read the parameter.
          StackManipulation readParameter =
              new StackManipulation.Compound(
                  MethodVariableAccess.REFERENCE.loadFrom(1),
                  IntegerConstant.forValue(i),
                  ArrayAccess.REFERENCE.load(),
                  TypeCasting.to(convertedType));

          StackManipulation updateField =
              new StackManipulation.Compound(
                  // Duplicate object reference.
                  Duplication.SINGLE,
                  // Do any conversions necessary.
                  new ByteBuddyUtils.ConvertValueForSetter(readParameter)
                      .convert(TypeDescriptor.of(field.getType())),
                  // Now update the field.
                  FieldAccess.forField(new ForLoadedField(field)).write());
          stackManipulation = new StackManipulation.Compound(stackManipulation, updateField);
        }
        stackManipulation =
            new StackManipulation.Compound(stackManipulation, MethodReturn.REFERENCE);

        StackManipulation.Size size = stackManipulation.apply(methodVisitor, implementationContext);
        return new Size(size.getMaximalSize(), numLocals);
      };
    }
}