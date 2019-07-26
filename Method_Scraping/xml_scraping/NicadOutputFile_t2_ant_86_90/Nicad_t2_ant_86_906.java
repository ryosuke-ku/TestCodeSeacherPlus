// clone pairs:655:90%
// 906:ant/src/main/org/apache/tools/ant/util/XMLFragment.java

public class Nicad_t2_ant_86_906
{
    public Object createDynamicElement(String uri, String name, String qName) {
        Element e;
        if (uri.isEmpty()) {
            e = doc.createElement(name);
        } else {
            e = doc.createElementNS(uri, qName);
        }
        fragment.appendChild(e);
        return new Child(e);
    }
}