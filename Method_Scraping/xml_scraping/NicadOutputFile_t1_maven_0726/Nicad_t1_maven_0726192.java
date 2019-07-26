//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/plugin/DefaultExtensionRealmCache.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java
// clone pairs:723:75%
// 1211:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java

public class Nicad_t1_maven_0726192
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( !( obj instanceof VersionRange ) )
        {
            return false;
        }
        VersionRange other = (VersionRange) obj;

        boolean equals =
            recommendedVersion == other.recommendedVersion
                || ( ( recommendedVersion != null ) && recommendedVersion.equals( other.recommendedVersion ) );
        equals &=
            restrictions == other.restrictions
                || ( ( restrictions != null ) && restrictions.equals( other.restrictions ) );
        return equals;
    }
}