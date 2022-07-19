package ExemplosCollections;

import java.util.*;

public class ExemplosMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("hr-v", 15.6);
            put("uno", 16.1);
            put("palio", 14.5);
            put("sandero", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: ");

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Exiba os modelos: " + modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Exiba os consumos dos carros: " + consumos);

        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoEficiente)) {
                modeloEficiente = entry.getKey();
                System.out.println("Exiba o modelo mais econômico e seu consumo: " + modeloEficiente + " e " + consumoEficiente);
            }
        }
            Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
            String modeloMenosEficiente = "";
            for (Map.Entry<String, Double>entri: carrosPopulares.entrySet()) {
                if (entri.getValue().equals(consumoMenosEficiente)) {
                    modeloMenosEficiente = entri.getKey();
                    System.out.println("Exiba o modelo menos econômico e seu consumo: " + modeloMenosEficiente + " e " + consumoMenosEficiente);
                }
            }

            Iterator<Double>iterator = carrosPopulares.values().iterator();
            Double soma = 0d;
            while (iterator.hasNext()){
                soma+=iterator.next();
            }
            System.out.println("Exiba a soma dos consumos: "+ soma);

            System.out.println("Exiba a media dos consumos deste dicionário de  carros: "+ (soma/carrosPopulares.size()));

            Iterator<Double>iterator1 = carrosPopulares.values().iterator();
            while (iterator1.hasNext()){
                if(iterator1.next().equals(15.6))iterator1.remove();
            }
            System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: "+ carrosPopulares);

            Map<String, Double> carrosPopulare1 = new LinkedHashMap<>(){{
                put("gol", 14.4);
                put("hr-v", 15.6);
                put("uno", 16.1);
                put("palio", 14.5);
                put("sandero", 15.6);
            }};
            System.out.println("Exiba todos os carros na ordem em que foram informados: "+ carrosPopulare1);

            Map<String, Double> carrosPopulare2 = new TreeMap<>(carrosPopulare1);

            System.out.println("Exiba o dicionário ordenado pelo modelo: "+ carrosPopulare2);

            System.out.println("Apague o dicionario de carros: ");
            carrosPopulares.clear();

            System.out.println("Confira se o dicionario esta vazio: "+ carrosPopulares.isEmpty());


    }

}

