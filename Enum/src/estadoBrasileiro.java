    public enum estadoBrasileiro{
        SAO_PAULO("SP","São Paulo"),
        AMAPA("AP","Amapá"),
        RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
        MATO_GROSSO("MG","Mato Grosso");
        

        private String nome;
        private String Sigla;

        private estadoBrasileiro(String Sigla,String nome){
            
            this.Sigla = Sigla;
            this.nome = nome;
        }

        public String getNome(){
            return nome;
        }

        public String getSigla(){
            return Sigla;
        }

        public String Maiusculo(){
            return nome.toUpperCase();
        }
    



    }

