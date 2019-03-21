package std;

import java.util.ArrayList;
import java.util.HashMap;

public class Lista {

        private String ultimaAdd = new String();
        private String UltimaLista = new String();
        private HashMap<String, ArrayList<String>> listas = new HashMap<>();

        public boolean criarLista(String s){
            if(listas.containsKey(s)==true){
                ArrayList<String> item = new ArrayList<>();
                listas.put(s,item);
                return true;
            }
            return false;
        }

        public boolean addNaLista(ArrayList<String> s, String x){
            if(listas.containsKey(s)==true){
                return true;
            }
            return false;
        }
    }
//Desenvolva um aplicativo servidor que armazene em memória zero ou mais listas de
//String
//.
//O servidor deverá oferecer uma interface de forma a permitir ao cliente criar uma nova lista,
//adicionar valores em uma lista já existente, obter o último valor adicionado em uma lista, e
//por consequência, removê-lo dessa lista.  Desenvolva um aplicativo cliente capaz de fazer
//requisições a esse servidor.  Cliente e Servidor poderão ser desenvolvidos em diferentes
//linguagens de programação ou em uma mesma linguagem.
}
