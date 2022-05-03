import java.util.Scanner;

public class DirectedGraph {
    private int numVertices;
    private int numEdges;
    private int mat[][];
    
    public DirectedGraph(int numVertices, int numEdges) {
        this.numVertices = numVertices;
        this.numEdges = numEdges;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }
    
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(4,6);
        int mat[][] = new int[graph.getNumVertices()][graph.getNumVertices()];
        int path[][] = new int[graph.getNumVertices()][graph.getNumVertices()];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < graph.getNumVertices(); i++) {
            for (int j = 0; j < graph.getNumVertices(); j++) {
                System.out.print("Enter 1 if there is an edge from" + (i+1) + " to " + (j+1) + " or 0 if not: ");
                mat[i][j] = sc.nextInt();   
                path[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < graph.getNumVertices(); i++) {
            for (int j = 0; j < graph.getNumVertices(); j++) {
                System.out.print(path[i][j] + " "); 
            }
            System.out.println("");
        }
        graph.setMat(mat);
        int inDegree[] = new int[4];
        int outDegree[] = new int[4];
        for (int i = 0; i < graph.getNumVertices(); i++) {
            for (int j = 0; j < graph.getNumVertices(); j++) {
                if(mat[j][i] == 1) {
                    inDegree[i]++;
                }   
            }
        }
        for (int i = 0; i < graph.getNumVertices(); i++) {
            for (int j = 0; j < graph.getNumVertices(); j++) {
                if(mat[i][j] == 1){
                    outDegree[i]++;
                }   
            }
        }
        int maxInDegree = inDegree[0];
        int maxOutDegree = outDegree[0];
        for (int i = 1; i < outDegree.length; i++) {
            if(maxInDegree < inDegree[i]){
                maxInDegree = inDegree[i];
            }
            if(maxOutDegree < outDegree[i]){
                maxOutDegree = outDegree[i];
            }
        }
        System.out.println("MaxIndegree is: " + maxInDegree);
        System.out.println("MaxOutdegree is: " + maxOutDegree);
        int m = graph.getNumVertices();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < m; k++){
                    path[i][j] = path[i][j] + path[i][k] * path[k][j];
                    if(path[i][j] != 0)
                        path[i][j] = 1;
                }
            }
        }
        System.out.println("Path Matrix is: ");
        for (int i = 0; i < graph.getNumVertices(); i++) {
            for (int j = 0; j < graph.getNumVertices(); j++) {
                System.out.print(path[i][j]+" "); 
            }
            System.out.println("");
        }
    }
    public static int min(int a, int b) {
	if(a < b)
	 return(a); 
        else
	 return(b);
    }
}