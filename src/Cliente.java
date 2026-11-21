class Cliente implements Autenticavel {

    String senha = "abc123";

    @Override
    public boolean autenticar(String credencial) {
        return senha.equals(credencial);
    }
}
