public class Nicad_1480
{
    public void write( OutputStream output, Map<String, Object> options, Settings settings )
        throws IOException
    {
        Objects.requireNonNull( output, "output cannot be null" );
        Objects.requireNonNull( settings, "settings cannot be null" );

        String encoding = settings.getModelEncoding();
        // TODO Use StringUtils here
        if ( encoding == null || encoding.length() <= 0 )
        {
            encoding = "UTF-8";
        }

        try ( final Writer out = new OutputStreamWriter( output, encoding ) )
        {
            write( out, options, settings );
        }
    }
}