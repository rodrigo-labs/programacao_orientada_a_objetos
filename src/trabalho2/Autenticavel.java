/**
 * Created by rodrigo on 22/06/17.
 */
public interface Autenticavel {

    public boolean login(long doc, String senha);
    public boolean logout();
}
