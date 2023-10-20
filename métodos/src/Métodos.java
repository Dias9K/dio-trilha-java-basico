public class Métodos {
    public static void main(String[] args) {
       // os métodos correspondem a funções ou sub-rotinas disponíveis dentros das classes
       // deve ser nomeado como verbo(não obrigatório)
       // seguir o camelCase
       // todos os métodos devem ser definidos dentro de uma classe, não são globais
       // qual a proposta principal do seu método?
       // qual o tipo de RETORNO esperado após executar o método, não retorne valor deve ser representado pelo "void"
       // quais PARÂMETROS serão necessários para executar um método?
       // o método possui risco de apresentar exceção ("bug")
       // qual a visibilidade do método? (aplicação, pacotes, herança e própria classe)

       // public significa que o método é visível para todo o sistema
       // como o método tem a finalidade de SOMAR, precisa de dois ou mais parâmetros inteiros, sempre separados por vírgula
       //exemplos:
       public double somar (num1, int num2) {
        //lógica - finalidade do método
        return ...;

        public void imprimir (String texto){}
            // lógica - finalidade do método
            // por ter um VOID não precisa de return, pois não terá nenhum resultado

            //throws Exception: indica que o método, ao ser utilizado, poderá gerar uma exceção
            public double dividir (int dividendo, int divisor) throws Exception {}

            //este método não pode ser visto por outras classes o projeto
            private void metodoPrivado(){}

            //alguns equívocos estruturais
            public void validar(){}
            // este método deveria retornar algum valor do tipo boolean, mas o void impede isso

            public void calcularEnviar(){}
            // um método deve representar UMA ÚNICA responsabilidade
        
       } 
       
    }
}
