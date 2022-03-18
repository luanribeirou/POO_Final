package POO_Final;


public interface Digraph<E,T> extends Graph{
  public boolean isStronglyConnected();  // retorna true se o dígrafo é fortemente conexo
  void StronglyConnectedComponents(); // Componentes fortemente conectados de um grafo orientado
  void topologicalOrderTraversal(Visitor visitor);
  Digraph DijkstrasAlgorithm(int s); // Caminho mais curto a partir de uma unica fonte (s) - Algoritmo de Dijkstra - Este método pode ser implementado como um método de classe (static)
  Digraph FloydsAlgorithm(); // Caminho mais curto entre todos os pares de vértices - Algoritmo de Floyd - Este método pode ser implementado como um método de classe (static)
  
}