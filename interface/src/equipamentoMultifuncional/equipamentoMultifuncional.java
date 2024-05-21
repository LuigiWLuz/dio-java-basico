package equipamentoMultifuncional;

import equipamentos.copiadora.copiadora;
import equipamentos.digitalizadora.digitalizadora;
import equipamentos.impressora.impressora;

public class equipamentoMultifuncional implements copiadora,digitalizadora,impressora {

        public void copiar(){
             System.out.println("Copiou...");
        }

        public void digitalizar(){
             System.out.println("Digitalizou....");
        }

        public void imprimir(){
             System.out.println("Imprimiu...");
        }
}
