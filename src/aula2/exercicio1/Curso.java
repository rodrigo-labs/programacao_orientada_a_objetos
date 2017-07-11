package aula2.exercicio1;

/**
 * Created by rodrigo on 17/03/17.
 */
public class Curso {
   private String nome;
   private String nivel;
   private Unidade unidade;


   public Curso(String nome, String nivel, Unidade unidade) {
      this.nome = nome;
      this.nivel = nivel;
      this.unidade = unidade;
   }


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getNivel() {
      return nivel;
   }

   public void setNivel(String nivel) {
      this.nivel = nivel;
   }

   public Unidade getUnidade() {
      return unidade;
   }

   public void setUnidade(Unidade unidade) {
      this.unidade = unidade;
   }


   @Override
   public String toString() {
      return "Curso{" +
              "nome='" + nome + '\'' +
              ", nivel='" + nivel + '\'' +
              ", unidade=" + unidade +
              '}';
   }
}
