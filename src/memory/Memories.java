package memory;

import interfaces.Remembering;

public class Memories implements Remembering {

    private String name;
    private String currentMemory = " ";

     public Memories(String name){
        this.name=name;

    }
    public String toKnowMemory(){
        return name;
    }
    @Override
    public String toString(){
        return String.format("Person remembered-"+toKnowMemory());
    }

Memories memory;
    @Override
    public String remember(String memory) {
        currentMemory = memory;
        return memory;
    }
    @Override
    public String getMemory() {
        String memoryString = String.valueOf(memory);
        return currentMemory;
    }
}
