public class SmartTv {

    boolean ligada = false;
    int canal = 4;
    int volume = 16;

    public void ligar(){
        if(ligada == true)
         System.out.println("A Smart Tv já está ligada, seu Zé!");
       else{
        ligada = true;
        System.out.print("A Smart Tv está ligada..." + ligada );
       }
    }

    public void desligar(){
       if(ligada == false)
         System.out.println("A Smart Tv já está desligada, seu Zé!");
       else{
        ligada = false;
        System.out.print("A Smart Tv está desligada..." + ligada );
       }
    }

    public void aumentar(){
        ++volume;
        System.out.print("O volume foi aumentado, agora está em " + volume );
    }

    public void diminuir(){
        --volume;
        System.out.print("O volume foi diminuido, agora está em " + volume );
   
    }

    public void MudarCanal(int canal){
        if(this.canal == canal)
            System.out.print("Já está nesse canal não é possivel mudar para ele!");
        else{
            this.canal = canal;
            System.out.println("Canal alterado com Çucesso!");
        }
          

    }



   
}
