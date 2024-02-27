package memory;

import exceptions.SoundAppearanceException;

public class Sound{
        private String description;
        private String sound;
        public void setSound(String sound) throws SoundAppearanceException {
            if (sound == null) {
                throw new SoundAppearanceException();
            } else {
                this.sound = sound;
            }
        }

        public void setDescription(String description){
            this.description=description;
        }

        public String getDescription(){
          return description;
        }
        public String getSound(){
            return sound;
        }


        @Override
        public String toString() {
            return String.format("%s sound with description - %s",getSound(),getDescription());
        }

    }

