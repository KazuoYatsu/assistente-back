package com.example.assistente.drools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Indexadores {
    public static abstract class Hemacias {
        public static final List<Double> criancas = Arrays.asList(3.6, 4.8);
        public static final List<Double> homens = Arrays.asList(4.5, 6.0);
        public static final List<Double> mulheres = Arrays.asList(4.0, 5.4);
    }

    public static abstract class Hemoglobina {
        public static final List<Double> recemNascidos = Arrays.asList(18.0, 20.0);
        public static final List<Double> criancas = Arrays.asList(11.0, 12.0);
        public static final List<Double> homens = Arrays.asList(13.0, 18.0);
        public static final List<Double> mulheres = Arrays.asList(13.0, 18.0);
    }

    public static abstract class CelulaBranca {
        public static final List<Double> leucocitos = Arrays.asList(4000.0, 11000.0);
        public static final List<Double> bastonete = Collections.singletonList(800.0);
        public static final List<Double> seguimentados = Arrays.asList(1611.0, 8000.0);
        public static final List<Double> linfocitos = Arrays.asList(1500.0, 8000.0);
        public static final List<Double> monocitos = Arrays.asList(100.0, 1000.0);
        public static final List<Double> eosinofilos = Collections.singletonList(500.0);
        public static final List<Double> basofilos = Collections.singletonList(200.0);
    }

    public static final List<Double> plaquetas = Arrays.asList(150000.0, 450000.0);

    public static final List<Double> hdl = Arrays.asList(40.0, 60.0);

    public static abstract class AcidoUrico {
        public static final List<Double> homem = Arrays.asList(3.4, 7.0);
        public static final List<Double> mulher = Arrays.asList(2.4, 6.0);
    }

    public static final List<Double> pcr = Collections.singletonList(0.3);

    public static abstract class Albumina {
        public static final List<Double> recemNascidos = Arrays.asList(20.0, 45.0);
        public static final List<Double> criancas = Arrays.asList(32.0, 52.0);
        public static final List<Double> adultos = Arrays.asList(35.0, 50.0);
    }

    public static abstract class UreiaCreatinina {
        public static final List<Double> bebes = Arrays.asList(9.0, 40.0);
        public static final List<Double> criancas = Arrays.asList(11.0, 39.0);
        public static final List<Double> adultos = Arrays.asList(13.0, 43.0);
    }

    public static final List<Double> glicose = Arrays.asList(100.0, 126.0);

    public static abstract class TTPATP {
        public static final List<Double> tp = Arrays.asList(10.0, 14.0);
        public static final List<Double> ttpa = Arrays.asList(24.0, 40.0);
    }

    public static final List<Double> tgp = Arrays.asList(7.0, 56.0);
    public static final List<Double> tgo = Arrays.asList(5.0, 40.0);

    public static final List<Double> tsh = Arrays.asList(0.4, 4.5);
    public static final List<Double> t4Livre = Arrays.asList(0.7, 1.8);
    
    public static final List<Double> ldl = Arrays.asList(50.0, 70.0, 100.0, 130.0, 189.0);

    public static abstract class PSA {
        public static final List<Double> naoIdoso = Collections.singletonList(4.0);
        public static final List<Double> idoso = Collections.singletonList(4.5);
        public static final List<Double> idosoRisco = Collections.singletonList(6.5);
    }
    
    public static abstract class VHS {
    	public static abstract class Homem {
    		public static final List<Double> naoAdultoRisco = Collections.singletonList(15.0);
            public static final List<Double> adultoRisco = Collections.singletonList(20.0);
            public static final List<Double> idosoRiscoElevado = Collections.singletonList(30.0);
    	}
    	
    	public static abstract class Mulher {
    		public static final List<Double> naoAdultoRisco = Collections.singletonList(20.0);
            public static final List<Double> adultoRisco = Collections.singletonList(30.0);
            public static final List<Double> idosoRiscoElevado = Collections.singletonList(42.0);
    	}
    }
    
    public static abstract class Triglicerideos {
    	public static abstract class Jejum {
    		public static final List<Double> menos10 = Collections.singletonList(15.0);
            public static final List<Double> menos20 = Collections.singletonList(20.0);
            public static final List<Double> mais20 = Collections.singletonList(30.0);
    	}
    	
    	public static abstract class NaoJejum {
    		public static final List<Double> menos10 = Collections.singletonList(20.0);
            public static final List<Double> menos20 = Collections.singletonList(30.0);
            public static final List<Double> mais20 = Collections.singletonList(42.0);
    	}
    }
}
