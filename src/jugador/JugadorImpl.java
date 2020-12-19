package jugador;

public class JugadorImpl extends Jugador {
    
    private static JugadorImpl instance;

    private JugadorImpl() {
        super();
    }

    public static JugadorImpl getInstance() {
        if( instance == null ) {
			instance = new JugadorImpl();
		}
		
		return instance;
    }

    @Override
    protected void disparar() {
        // TODO Auto-generated method stub

    }
}
