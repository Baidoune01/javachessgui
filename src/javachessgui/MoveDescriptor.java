package javachessgui;


public class MoveDescriptor {
    
    public int to_i;
    public int to_j;
    
    public Boolean end_piece;
    public Boolean castling;
    
    public int next_vector;
    
    public MoveDescriptor()
    {
        end_piece=false;
        castling=false;
    }
}