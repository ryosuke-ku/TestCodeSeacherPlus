public class Nicad_1593
{
        public boolean equals( Object o )
        {
            if ( this == o )
            {
                return true;
            }
            if ( o == null || getClass() != o.getClass() )
            {
                return false;
            }

            StringItem that = (StringItem) o;

            return value.equals( that.value );

        }
}