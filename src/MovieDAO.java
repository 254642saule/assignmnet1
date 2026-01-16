import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    public void saveMovie(Movie movie) {
        String sql = "INSERT INTO movies VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, movie.getId());
            ps.setString(2, movie.getTitle());
            ps.setString(3, movie.getGenre());
            ps.setInt(4, movie.getDuration());

            ps.executeUpdate();
            System.out.println("Movie saved to DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM movies";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                movies.add(new Movie(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getInt("duration")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
}
