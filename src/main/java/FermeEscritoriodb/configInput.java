
package FermeEscritoriodb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configInput {

    Properties config = new Properties();
    InputStream configInput = null;

    public String recuperarDato(String dato) throws FileNotFoundException, IOException {

        configInput = new FileInputStream("Configuracion.properties");
        config.load(configInput);

        String datos = config.getProperty(dato);
        return datos;
    }

}
