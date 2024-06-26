package cl.tbd.proyecto.entities;

public class VoluntarioEntity {
        private Long id_voluntario;
        private Long user_id;
        private String rut;
        private String nombre;
        private int edad;
        private String direccion;
        private String genero;
        private String email;
        private String telefono;
       //TODO: revisar esto, no esta como tal en el loadData de la base de datos. como no es JPA quiza no haya atado.
        //TODO: Eso si, no es posible al parecer efectuar una consulta directamente con postman, ev cambio a formato de la BD.
        private double latitud;
        private double longitud;

        public VoluntarioEntity(Long id, Long userId, String nombre, int edad, String direccion, String genero, String email, String telefono, double latitud, double longitud) {
            this.id_voluntario = id;
            this.user_id = userId;
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
            this.genero = genero;
            this.email = email;
            this.telefono = telefono;
            this.latitud = latitud;
            this.longitud = longitud;
        }

        public Long getUserId() {
            return user_id;
        }

        public void setUserId(Long userId) {
            this.user_id = userId;
        }

        public Long getId() {
            return id_voluntario;
        }

        public void setId(Long id) {
            this.id_voluntario = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public double getLatitud() {
            return latitud;
        }

        public void setLatitud(double latitud) {
            this.latitud = latitud;
        }

        public double getLongitud() {
            return longitud;
        }

        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
