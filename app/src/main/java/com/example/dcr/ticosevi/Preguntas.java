package com.example.dcr.ticosevi;

import java.util.ArrayList;

public class Preguntas {

    private static Preguntas instance = null;
    private int nivel = 0;//1 -> 10, 2-> 20, 3-> 40
    private ArrayList<Pregunta> preguntas = new ArrayList<>(); //el array debe ser de obejtos preguta o de lo que se cargue de la base de datos
    private ArrayList<Integer> respondidas = new ArrayList<>();
    private int buenas = 0;
    private int malas = 0;
    private int estado = 0;


    protected Preguntas(){
    }

    public static Preguntas getInstance() {
        if(instance == null) {
            instance = new Preguntas();
            instance.cargarPreguntas();
        }
        return instance;
    }

    public void cargarPreguntas(){
        //Pregunta pre1 = new Pregunta();
        Pregunta pre2 = new Pregunta(0, "Significa aumentar la contaminación de nuestro planeta, el consumo de combustible y atentar contra la salud:\n",
                "", "Comprobar el buen estado de los dispositivos del sistema de control de emisiones del motor.\n",
                "La alteración de los elementos de control de emisiones del motor.\n",
                "Conservar en el mejor estado o sustituir los componentes del sistema de control de emisiones del motor.\n",
                "La alteración de los elementos de control de emisiones del motor.");
        Pregunta pre3 = new Pregunta(1, "¿Es posible adelantar en una rotonda?", "", "Falso.",
                "Verdadero.", "", "Falso.");
        Pregunta pre4 = new Pregunta(2, "La imagen que se muestra corresponde a una señal de:", "limitelargo", "Información.",
                "Reglamentación.", "Prevención.", "Reglamentación.");
        Pregunta pre5 = new Pregunta(3, "Facilita el control de aceleración y potencia del motor dentro del rango que se determina como conducción económica y eficiente:",
                "", "El medidor de velocidad.", "El medidor de temperatura.", "El tacómetro.", "El tacómetro.");
        Pregunta pre6 = new Pregunta(4, "Cuál es un componente del sistema de escape?:",
                "", "Catalizador.", "Carburador.", "Bobina.", "Catalizador.");
        Pregunta pre7 = new Pregunta(5, "Se suspenderá la licencia a aquel conductor que en categoría común o profesional:",
                "", "Acumule 6 puntos.", "Acumule 12 puntos o más.", "Acumule 6 puntos o más.", "Acumule 12 puntos o más.");
        Pregunta pre8 = new Pregunta(6, "En las curvas:", "", "Durante la noche utilizar la luz alta para tener mayor visibilidad.",
                "Nunca se debe adelantar y se debe mantener el mismo carril.", "Se debe mantener la velocidad con la que se ingresó.",
                "Nunca se debe adelantar y se debe mantener el mismo carril.");
        Pregunta pre9 = new Pregunta(7, "Además de aire y calor(chispa), que más se necesita para que el motor funcione:", "",
                "Agua.", "Aceite.", "Combustible.", "Combustible.");
        Pregunta pre10 = new Pregunta(8, "Son elementos físicos que se utilizan en la regulación del tránsito. Sirven para que el usuario, guiándose por sus indicaciones, se comporte con corrección y seguridad en las vías, disminuyendo así el riesgo de que ocurran accidentes.\n", "",
                "Las señales.", "Líneas en la calzada (de centro, de vía, de barrera, de borde).", "Semáforos y capta luces.", "Las señales.");
        Pregunta pre11 = new Pregunta(9, "Asegurarse de las buenas condiciones del vehículo y del conductor es una norma primordial que se debe observar y cumplir:", "",
                "Cuando se ha iniciado la marcha en carretera.", "Antes de iniciar la circulación.", "Después de iniciada la circulación vehicular.", "Antes de iniciar la circulación.");
        Pregunta pre12 = new Pregunta(10, "La imagen que se muestra corresponde a una señal de:", "obras",
                "Información general.", "Prevención de obras.", "Recomendación.", "Prevención de obras.");
        Pregunta pre13 = new Pregunta(11, "La imagen que se muestra corresponde a una señal de:", "prevencion",
                "Prevención de obras.", "Prevención.", "Información.", "Prevención.");
        Pregunta pre14 = new Pregunta(12, "¿Para obtener una licencia de conducir clase C se necesita haber obtenido la aprobación del Curso Básico de Educación Vial para Transporte Público?", "",
                "Verdadero.", "Falso.", "", "Verdadero.");
        Pregunta pre15 = new Pregunta(13, "La ley 9078 lleva como nombre:", "",
                "Ley de Tránsito por Vías Públicas Terrestres y Seguridad Vial.", "Ley de Administración Vial.", "Ley de Tránsito.",
                "Ley de Tránsito por Vías Públicas Terrestres y Seguridad Vial.");
        Pregunta pre16 = new Pregunta(14, "En el semáforo vehicular la luz roja intermitente es equivalente a:", "semaforo",
                "Una señal de alto.", "Una señal de ceda el paso.", "Prevención de peligro.",
                "Una señal de alto.");
        Pregunta pre17 = new Pregunta(15, "¿El sueño en la conducción puede ser provocado por?", "",
                "El exceso de velocidad.", "La hora del día en que se maneje.", "El calor ambiental.",
                "La hora del día en que se maneje.");
        Pregunta pre18 = new Pregunta(16, "Una llanta con mucha presión:", "",
                "Da más estabilidad al vehículo.", "Se desgastará más a los lados.", "Se desgastará más en el centro.",
                "Se desgastará más en el centro.");
        Pregunta pre19 = new Pregunta(17, "El lugar de la vía pública donde convergen 2 o más vías es:", "",
                "La intersección.", "El espaldón.", "La estructura vial.",
                "La intersección.");
        Pregunta pre20 = new Pregunta(18, "La trilogía vial se compone de 3 elementos, ¿Cuál elemento completa la siguiente imagen?", "triangulo",
                "Factor emocional.", "Factor humano.", "Factor social.",
                "Factor humano.");
        Pregunta pre21 = new Pregunta(19, "Estos son los tres tipos de señalamiento luminoso:", "",
                "Semáforo vehicular, semáforo peatonal y capta luces.", "Semáforo vehicular, semáforo peatonal y señalamiento preventivo.",
                "Semáforo vehicular, semaforo peatonal y señal luminosa informativa.", "Semáforo vehicular, semaforo peatonal y señal luminosa informativa.");
        Pregunta pre22 = new Pregunta(20, "A que conductor que en categoría novato acumule 6 puntos en su licencia recibe una suspensión de la misma por un período de:", "",
                "1 año la primera vez.", "2 años la primera vez.", "6 meses la primera vez.", "1 año la primera vez.");
        Pregunta pre23 = new Pregunta(21, "La imagen que se muestra corresponde a una señal de:", "restaurante",
                "Identificación.", "Servicio y turismo.", "Recomendación.", "Servicio y turismo.");
        Pregunta pre24 = new Pregunta(22, "La imagen que se muestra corresponde a una señal de:", "maximo",
                "Información.", "Reglamentación.", "Prevención.", "Reglamentación.");
        Pregunta pre25 = new Pregunta(23, "La acera es parte de la vía:", "",
                "Urbana.", "Rural.", "Rural y urbana.", "Urbana.");
        Pregunta pre26 = new Pregunta(24, "Educar al ciudadano en el uso correcto de la vía pública y sus automotores  es un objetivo de:", "",
                "MOPT.", "Seguridad vial.", "COSEVI.", "Seguridad vial.");
        Pregunta pre27 = new Pregunta(25, "El \"derecho a circular\" está protegido constitucionalmente en:", "",
                "El artículo 22 de la Constitución política.", "El artículo 1 de la Ley de Tránsito.",
                "El artículo 22 de la Ley de Tránsito.", "El artículo 22 de la Constitución política.");
        Pregunta pre28 = new Pregunta(26, "Un buen hábito, para el ejercicio de una conducción económica es:", "",
                "Deshacerse de todo peso extra del vehículo.", "Mantener una alta presión de llantas.",
                "Hacer un calentamiento previo del vehículo.", "Deshacerse de todo peso extra del vehículo.");
        Pregunta pre29 = new Pregunta(27, "El oficial procederá al retiro temporal de un vehículo en el siguiente caso:", "",
                "Cuando las condiciones mecánicas del vehículo le impidan circular, salvo que el conductor contrate los servicios privados de acarreo.",
                "Al conductor que incumpla las indicaciones para la circulación en rotondas.","A quien circule con exceso de carga.",
                "Cuando las condiciones mecánicas del vehículo le impidan circular, salvo que el conductor contrate los servicios privados de acarreo.");
        Pregunta pre30 = new Pregunta(28, "Las láminas ubicadas en postes o lugares elevados, pertenecen al tipo de dispositivos:", "",
                "Verticales.",
                "Horizontales.","Luminosos.",
                "Verticales.");
        Pregunta pre31 = new Pregunta(29, "Cuando el conductor se sienta alterado por alguna condición mental o emocional, se recomienda:", "",
                "Confiar el manejo de su automóvil a otra persona.", "Vender el automóvil.","Contratar un chofer personal.", "Confiar el manejo de su automóvil a otra persona.");
        Pregunta pre32 = new Pregunta(30, "Por definición, sanción es:", "",
                "Oficial de tránsito o juez de tránsito que castiga con multa al infractor.",
                "Persona que incumpla una o más normas legales.","Pena o castigo que se aplica a una persona cuando infringe una o más normas legales..",
                "Pena o castigo que se aplica a una persona cuando infringe una o más normas legales..");
        Pregunta pre33 = new Pregunta(31, "¿El sistema de escape evacúa los gases quemados que resultan del proceso de combustión?", "",
                "Falso.",
                "Verdadero.","",
                "Verdadero.");
        Pregunta pre34 = new Pregunta(32, "El oficial procederá al retiro temporal de un vehículo en el siguiente caso:", "",
                "Cuando el vehículo sea conducido por vía pública sin estar inscrito en el Registro Nacional.",
                "Al conductor que permita que niños menores de 12 años que midan menos de 1,45 metros de estatura viajen sin dispositivos especiales de seguridad.",
                "A quien adelante aprovechándose de maniobras de los vehículos de emergencia.",
                "Cuando el vehículo sea conducido por vía pública sin estar inscrito en el Registro Nacional.");
        Pregunta pre35 = new Pregunta(33, "La rotonda:", "",
                "Es una construcción vial que permite librar un óbstaculo artificial como una vía férreas o carretera.",
                "Es una construcción vial que permite el cruce de dos o más ejes de transporte a diferentes alturas.",
                "Es una construcción vial diseñada para facilitar los cruces de vías.",
                "Es una construcción vial diseñada para facilitar los cruces de vías.");
        Pregunta pre36 = new Pregunta(34, "Una llanta con poca presión:", "", "Se desgastará más a los lados.", "Se desgastará más en el centro.",
                "Da más estabilidad al vehículo.", "Se desgastará más a los lados.");
        Pregunta pre37 = new Pregunta(35, "Según lo dispuesto en la Ley de Tránsito, un requisito de tipo formal para conducir un vehículo es:", "",
                "Carrocería en buen estado.", "Título de propiedad.",
                "Certificado de curso teórico aprobado.", "Título de propiedad.");
        Pregunta pre38 = new Pregunta(36, "Los captaluces de color blanco se pueden usar como complemento para la:", "",
                "Línea de vía.", "Línea de barrera.",
                "Línea de centro.", "Línea de vía.");
        Pregunta pre39 = new Pregunta(37, "Como complemento a la línea de borde se utilizan captaluces de color rojo para:", "",
                "Resaltar zonas de menor riesgo o circulación normal.", "Resaltar zonas de mayor riesgo o peligro.",
                "Resaltar zonas poco transitadas.", "Resaltar zonas de mayor riesgo o peligro.");
        Pregunta pre40 = new Pregunta(38, "Se sanciona al chofer de moto o bimoto con 4 puntos cuando:", "",
                "Transporte a niños menores de 5 años.", "Hable por celular.",
                "Adelante en curva.", "Transporte a niños menores de 5 años.");
        Pregunta pre41 = new Pregunta(39, "La regla más recomendable para seguir a otro vehículo, ¿Se basa en?", "",
                "Kilometros.", "Tiempos.", "Metros.", "Tiempos. ");
        Pregunta pre42 = new Pregunta(40, "La imagen que se muestra corresponde a una señal de:", "ciclista",
                "Prevención.", "Información.", "Reglamentación.", "Reglamentación.");
        Pregunta pre43 = new Pregunta(41, "La imagen que se muestra corresponde a una señal de:", "gasolina",
                "Información general.", "Destino y distancia.", "Recomendación.", "Información general.");
        Pregunta pre44 = new Pregunta(42, "Los tambores y pastillas son componentes del sistema de:", "",
                "Dirección.", "Embrague.", "Frenos.", "Frenos.");
        Pregunta pre45 = new Pregunta(43, "Quien maneja a la defensiva debe:", "",
                "Conducir confiadamente.", "Esperar todo, imaginar todo, y suponer todo.",
                "Conducir suave y guardando la distancia.", "Esperar todo, imaginar todo, y suponer todo.");
        Pregunta pre46 = new Pregunta(44, "Aumenta la distancia de reacción:", "",
                "Alcohol y fatiga.", "Fatiga y temeridad.", "Exhibicionismo y agresividad", "Alcohol y fatiga.");
        Pregunta pre47 = new Pregunta(45, "La contaminación calórica causa:", "",
                "Fatiga auditiva, irritabilidad y tensión arterial. ", "Fatiga, adormecimiento y deshidratación.",
                "Aumento en los padecimientos de cáncer.", "Fatiga, adormecimiento y deshidratación.");
        Pregunta pre48 = new Pregunta(46, "Un objetivo de la seguridad vial es:", "",
                "Aumentar el número de conductores.", "Disminuir los daños a personas y bienes en la vía pública.",
                "Regular todo lo relativo al pago de impuestos, multas y derechos de tránsito.", "Disminuir los daños a personas y bienes en la vía pública.");
        Pregunta pre49 = new Pregunta(47, "¿Cuál es un componente del sistema eléctrico?", "",
                "Carburador.", "Carter.", "Alternador.", "Alternador.");
        Pregunta pre50 = new Pregunta(48, "Consiste en un grado de elevación mayor en uno de los extremos de la calzada:", "",
                "Peralte o sobreelevación.", "Resistencia aerodinámica.",
                "Espaldón.", "Peralte o sobreelevación.");
        Pregunta pre51 = new Pregunta(49, "El significado de la imagen que se muestra es:", "nino",
                "Zona escolar.", "Niños jugando en la carretera.",
                "Campos de juego.", "Campos de juego.");
        Pregunta pre52 = new Pregunta(50, "Son para el cruce de peatones en lugares con gran tránsito peatonal, se pintan como franjas anchas discontinuas paralelas entre sí:", "",
                "Zona de seguridad.", "Zona de peatones.",
                "Zona de paso.", "Zona de seguridad.");
        Pregunta pre53 = new Pregunta(51, "En que consiste el manejo seguro al conducir:", "",
                "Una serie de técnicas de manejo mediante las cuales se evitan accidentes de tránsito.",
                "Es una serie de buenos hábitos preventivos mediante los cuales se evitan accidentes de tránsito.",
                "Una serie de habilidades y destrezas de manejo mediante las cuales se evitan accidentes de tránsito.",
                "Es una serie de buenos hábitos preventivos mediante los cuales se evitan accidentes de tránsito.");
        Pregunta pre54 = new Pregunta(52, "Se caracteriza porque aprovecha la energía de los gases resultantes de la combustión:", "",
                "El turbo cargador.", "El turbo inyector.",
                "El hidro carburador.", "El turbo cargador.");
        Pregunta pre55 = new Pregunta(53, "La imagen que se muestra corresponde a una señal de:", "novirar",
                "Prevención.", "Información.", "Reglamentación.", "Reglamentación.");
        Pregunta pre56 = new Pregunta(54, "Se utilizan en intersecciones, para guiar específicamente en el giro al lado izquierdo, separando los carriles principales de los que van directo o viran a la derecha:\n", "",
                "Línea de parada.", "Línea de canalización.",
                "Isla de canalización.", "Línea de canalización.");
        Pregunta pre57 = new Pregunta(55, "Son un tipo especial de intersección caracterizado por que las vías que confluyen se comunican a través de un anillo, en el que se establece una circulación rotatoria alrededor de una isleta central. El texto anterior hace referencia a:\n", "",
                "Una rotonda.", "Una intersección.",
                "Un paso a desnivel.", "Una rotonda.");
        Pregunta pre58 = new Pregunta(56, "¿Qué es el hidroplaneamiento?", "",
                "Patinazo del vehículo en la vía.", "Inundación sobre la calzada lo que causa descontrol del vehículo.",
                "La pérdida de contacto de las llantas del vehículo con la superficie de rodamiento a causa del agua.",
                "La pérdida de contacto de las llantas del vehículo con la superficie de rodamiento a causa del agua.");
        Pregunta pre59 = new Pregunta(57, "Las prohibiciones que derivan en multas, suspensión de licencias o el retiro de circulación de un vehículo se encuentran establecidas en:", "",
                "La Educación Vial.", "La Ley de Tránsito.",
                "La Seguridad Vial.", "La Ley de Tránsito.");
        Pregunta pre60 = new Pregunta(58, "El exceso de ruido es un tipo de contaminación atmosférica:", "",
                "Sónica.", "Eletromagnética.",
                "Calórica.", "Sónica.");
        Pregunta pre61 = new Pregunta(59, "Las multas más altas, tipo A, se aplicarán:", "",
                "Para las infracciones más graves.", "Para las infracciones menos peligrosas.",
                "Para todas las infracciones.", "Para las infracciones más graves.");
        Pregunta pre62 = new Pregunta(60, "Para efectos de regulación, se demarca así: Lugares que se permite el rebase: línea discontinua amarilla. Lugares que no se permite el rebase: línea continua amarilla. ¿A que tipo de línea se refiere?\n", "",
                "Línea de vía.", "Línea de centro.",
                "Línea de barrera.", "Línea de centro.");
        Pregunta pre63 = new Pregunta(61, "¿La zona destinada a generar espacio para las emergencias se llama?", "",
                "Canaleta.", "Calzada.", "Espaldón.", "Espaldón.");
        Pregunta pre64 = new Pregunta(62, "Como complemento a la línea de vía se utilizan captaluces de color:", "",
                "Blanco.", "Rojo.", "Amarillo.", "Blanco.");
        Pregunta pre65 = new Pregunta(63, "Para prevenir el choque de frente al adelantar, ¿Qué debemos hacer?", "",
                "Observar por los espejos retrovisores.", "Eliminar el ángulo muerto.",
                "Mirar siempre hacia delante, otro vehículo puede haber invadido su carril.", "Mirar siempre hacia delante, otro vehículo puede haber invadido su carril.");
        Pregunta pre66 = new Pregunta(64, "La _______ resulta muy importante de conocer y controlar, sobre todo en tránsito urbano, por cuanto genera un alto consumo de combustible y desgaste. El texto anterior se completa con:\n", "",
                "resistencia aerodinámica", "resistencia parásita",
                "fuerza de inercia", "fuerza de inercia");
        Pregunta pre67 = new Pregunta(65, "¿Cuáles son 2 condiciones emocionales o mentales que afectan la capacidad del conductor para manejar con seguridad?", "",
                "Fatiga y agresividad.", "Sueño y cólera.",
                "Negligencia y vanidad.", "Negligencia y vanidad.");
        Pregunta pre68 = new Pregunta(66, "Si pensamos abandonar una rotonda por la primera salida, debemos utilizar:", "",
                "El carril externo.", "Cualquier carril.",
                "El carril interno.", "El carril externo.");
        Pregunta pre69 = new Pregunta(67, "Advertir al usuario sobre la existencia de posibles peligros y óbstaculos en la vía es una función de:", "",
                "La seguridad vial.", "El señalamiento vial.", "Las señales horizontales.", "El señalamiento vial.");
        Pregunta pre70 = new Pregunta(68, "La imagen que se muestra corresponde a una señal de:", "unavia",
                "Reglamentación.", "Información.",
                "Prevención.", "Reglamentación.");
        Pregunta pre71 = new Pregunta(69, "El factor lambda:", "",
                "Establece una mezcla ideal de combustible y aceite.", "Establece una mezcla ideal de combustible y agua.",
                "Establece una mezcla ideal de aire y combustible.", "Establece una mezcla ideal de aire y combustible.");

        //this.preguntas.add(pre1);
        this.preguntas.add(pre2);
        this.preguntas.add(pre3);
        this.preguntas.add(pre4);
        this.preguntas.add(pre5);
        this.preguntas.add(pre6);
        this.preguntas.add(pre7);
        this.preguntas.add(pre8);
        this.preguntas.add(pre9);
        this.preguntas.add(pre10);
        this.preguntas.add(pre11);
        this.preguntas.add(pre12);
        this.preguntas.add(pre13);
        this.preguntas.add(pre14);
        this.preguntas.add(pre15);
        this.preguntas.add(pre16);
        this.preguntas.add(pre17);
        this.preguntas.add(pre18);
        this.preguntas.add(pre19);
        this.preguntas.add(pre20);
        this.preguntas.add(pre21);
        this.preguntas.add(pre22);
        this.preguntas.add(pre23);
        this.preguntas.add(pre24);
        this.preguntas.add(pre25);
        this.preguntas.add(pre26);
        this.preguntas.add(pre27);
        this.preguntas.add(pre28);
        this.preguntas.add(pre29);
        this.preguntas.add(pre30);
        this.preguntas.add(pre31);
        this.preguntas.add(pre32);
        this.preguntas.add(pre33);
        this.preguntas.add(pre34);
        this.preguntas.add(pre35);
        this.preguntas.add(pre36);
        this.preguntas.add(pre37);
        this.preguntas.add(pre38);
        this.preguntas.add(pre39);
        this.preguntas.add(pre40);
        this.preguntas.add(pre41);
        this.preguntas.add(pre42);
        this.preguntas.add(pre43);
        this.preguntas.add(pre44);
        this.preguntas.add(pre45);
        this.preguntas.add(pre46);
        this.preguntas.add(pre47);
        this.preguntas.add(pre48);
        this.preguntas.add(pre49);
        this.preguntas.add(pre50);
        this.preguntas.add(pre51);
        this.preguntas.add(pre52);
        this.preguntas.add(pre53);
        this.preguntas.add(pre54);
        this.preguntas.add(pre55);
        this.preguntas.add(pre56);
        this.preguntas.add(pre57);
        this.preguntas.add(pre58);
        this.preguntas.add(pre59);
        this.preguntas.add(pre60);
        this.preguntas.add(pre61);
        this.preguntas.add(pre62);
        this.preguntas.add(pre63);
        this.preguntas.add(pre64);
        this.preguntas.add(pre65);
        this.preguntas.add(pre66);
        this.preguntas.add(pre67);
        this.preguntas.add(pre68);
        this.preguntas.add(pre69);
        this.preguntas.add(pre70);
        this.preguntas.add(pre71);

    }

    public int getSize(){
        return this.preguntas.size();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pregunta getPregunta(int i) {
        return preguntas.get(i);
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        preguntas = preguntas;
    }

    public int getBuenas() {
        return buenas;
    }

    public void setBuenas(int buenas) {
        this.buenas = buenas;
    }

    public int getMalas() {
        return malas;
    }

    public void setMalas(int malas) {
        this.malas = malas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
