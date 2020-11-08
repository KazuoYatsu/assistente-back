package com.example.assistente.drools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Indexadores {
    static abstract class Hemacias {
        static final List<Double> criancas = Arrays.asList(3.6, 4.8);
        static final List<Double> homens = Arrays.asList(4.5, 6.0);
        static final List<Double> mulheres = Arrays.asList(4.0, 5.4);
    }

    static abstract class Hemoglobina {
        static final List<Double> recemNascidos = Arrays.asList(18.0, 20.0);
        static final List<Double> criancas = Arrays.asList(11.0, 12.0);
        static final List<Double> homens = Arrays.asList(13.0, 18.0);
        static final List<Double> mulheres = Arrays.asList(13.0, 18.0);
    }

    static final List<Double> plaquetas = Arrays.asList(150000.0, 450000.0);

    static final List<Double> hdl = Arrays.asList(40.0, 60.0);

    static abstract class AcidoUrico {
        static final List<Double> homem = Arrays.asList(3.4, 7.0);
        static final List<Double> mulher = Arrays.asList(2.4, 6.0);
    }

    static final List<Double> pcr = Arrays.asList(0.3, 3.0);

    static abstract class Albumina {
        static final List<Double> recemNascidos = Arrays.asList(20.0, 45.0);
        static final List<Double> criancas = Arrays.asList(32.0, 52.0);
        static final List<Double> adultos = Arrays.asList(35.0, 50.0);
    }

    static abstract class CelulaBranca {
        static final List<Double> leucocitosTotais = Arrays.asList(4000.0, 11000.0);
        static final List<Double> bastonete = Arrays.asList(0.0, 800.0);
        static final List<Double> seguimentados = Arrays.asList(1611.0, 8000.0);
        static final List<Double> linfocitos = Arrays.asList(1500.0, 8000.0);
        static final List<Double> monocitos = Arrays.asList(100.0, 1000.0);
        static final List<Double> eosinofilos = Arrays.asList(0.0, 500.0);
        static final List<Double> basofilos = Arrays.asList(0.0, 200.0);
    }

    static abstract class UreiaCreatinina {
        static final List<Double> bebes = Arrays.asList(9.0, 40.0);
        static final List<Double> criancas = Arrays.asList(11.0, 39.0);
        static final List<Double> adultos = Arrays.asList(13.0, 43.0);
    }

    static final List<Double> glicose = Arrays.asList(90.0, 100.0, 125.0);

    static abstract class TTPATP {
        static final List<Double> tp = Arrays.asList(10.0, 14.0);
        static final List<Double> inrTp = Arrays.asList(0.8, 1.0);
        static final List<Double> ttpa = Arrays.asList(24.0, 40.0);
    }

    static final List<Double> tgp = Arrays.asList(7.0, 56.0);
    static final List<Double> tgo = Arrays.asList(5.0, 40.0);

    static final List<Double> ldl = Arrays.asList(50.0, 70.0, 100.0, 130.0, 189.0);

    static abstract class PSA {
        static final List<Double> v = Collections.singletonList(4.0);
        static final List<Double> mv = Collections.singletonList(4.5);
        static final List<Double> mmv = Collections.singletonList(6.5);
    }
}
