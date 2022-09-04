import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Animal {
    public String nome;
    public Double idade;

    /**
     * @param filePath deve ser um arquivo do tipo .wav
     */
    public static void emitirSom(String filePath) {
        File f = new File(filePath);
        
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(f));
            clip.start();
            try {
                Thread.sleep(5000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        } catch (Exception e){
            System.out.println("Ocorreu um erro ao tentar reproduzir o áudio:");
            e.printStackTrace();
        }
    }
}