package exceptions;

public class SoundAppearanceException extends Exception{
    public SoundAppearanceException() {
        super("Sound object is not initialized");
    }

    public SoundAppearanceException(String message) {
        super(message);
    }
}
