package trees;

public class Graph <T extends Comparable>{

    private Vertex<T> head;

    public  Vertex<T>findVertex(String id){
        Vertex<T> iterator=head;
        while(iterator!=null){
            if(iterator.id.compareTo(id)==0){
                return iterator;
            }
            iterator=iterator.nextVertex;
        }
        return null;
    }
    public int inDegree(String id){
return 0;
    }
    public int outDegree(String id){
        return 0;
    }
    public void addVertex(String id){

    }
    public void addEdge(String idStart,String idEnd,int weight){

    }
    //list of neighbors of given vertex

    public void FindNeighbors(String id){
        Vertex<T> current =findVertex(id);
        if(current ==null){
            System.out.println("There is no vertex with that id");
        }else{
            Edge iterator=current.EdgeLink;
            while(iterator!=null){
                System.out.println(iterator.vertexId);
                iterator=iterator.nextEdge;
            }

        }

    }
}
