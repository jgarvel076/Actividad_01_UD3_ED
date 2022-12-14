package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Julián García Velázquez (jgarvel076)
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] bufer = new byte[1000];
    private static String archivoNombre = "fichero.dat";
    private static FileInputStream flujoEntrada = null;
    private static BufferedInputStream buferEntrada = null;

    public static void iniciarArchivos() throws FileNotFoundException
    {
        inputStream = new FileInputStream(archivoNombre);
        entradaBufer = new BufferedInputStream(flujoEntrada);
    }
    
    public static int mostrarTextoArchivo() throws IOException
    {
        int total = 0;
        int nRead = 0;
        while((nRead = inputStream.read(buffer)) != -1)
        {
            System.out.println(new String(buffer));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializateFiles();
            
            int total = showFileText();

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( entradaBufer != null && inputStream != null )
                {
                    inputStream.close();
                    entradaBufer.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }

    public static byte[] getBufer() {
        return bufer;
    }

    public static void setBufer(byte[] bufer) {
        Actividad_01_UD3_ED.bufer = bufer;
    }

    public static String getArchivoNombre() {
        return archivoNombre;
    }

    public static void setArchivoNombre(String archivoNombre) {
        Actividad_01_UD3_ED.archivoNombre = archivoNombre;
    }

    public static FileInputStream getFlujoEntrada() {
        return flujoEntrada;
    }

    public static void setFlujoEntrada(FileInputStream flujoEntrada) {
        Actividad_01_UD3_ED.flujoEntrada = flujoEntrada;
    }

    public static BufferedInputStream getBuferEntrada() {
        return buferEntrada;
    }

    public static void setBuferEntrada(BufferedInputStream buferEntrada) {
        Actividad_01_UD3_ED.buferEntrada = buferEntrada;
    }
}