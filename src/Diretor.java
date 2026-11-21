class Diretor implements Autenticavel {

    String token = "12345";

    @Override
    public boolean autenticar(String credencial) {
        return token.equals(credencial);
    }
}