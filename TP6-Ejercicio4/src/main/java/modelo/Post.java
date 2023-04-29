package modelo;

class Post {

    private Long userId;
    private Long id;
    private String title;
    private String body;

    Post(Long userId, Long id, String titulo, String cuerpo) {
	this.userId = userId;
	this.id = id;
	this.title = titulo;
	this.body = cuerpo;
    }

    Long getUserId() {
	return userId;
    }

    Long getId() {
	return id;
    }

    String getTitulo() {
	return title;
    }

    String getCuerpo() {
	return body;
    }

    @Override
    public String toString() {
	return "userId: " + userId + "\nid: " + id + "\ntitulo: " + title + "\ncuerpo: " + body + "\n";
    }

}
