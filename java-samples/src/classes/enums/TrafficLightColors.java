package classes.enums;

import interfaces.Color;

public enum TrafficLightColors {
    RED {
        public Color getColor(){ return new Color("RED"); }
    },
    GREEN {
        public Color getColor(){ return new Color("GREEN"); }
    },
    ORANGE {
        public Color getColor(){ return new Color("ORANGE"); }
    },
    ;
          
    abstract Color getColor();
    
    public static void main(String[] args){
        System.out.println(TrafficLightColors.RED.getColor());
    }
};
