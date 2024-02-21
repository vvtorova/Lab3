package Memory;

import Exceptions.SoundAppearanceException;

public class Sound{
        private String description;
        private String sound;
        public void setSound(String sound) throws SoundAppearanceException {
            if (sound == null) {
                throw new SoundAppearanceException();
            }
            this.sound = sound;
        }

        public void setDescription(String description){
        }

        public String getDecription(){
          return description;
        }

        @Override
        public String toString() {
            return String.format("%s sound %s",sound,description);
        }

    }

