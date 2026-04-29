import java.sql.*;

public class RouteService {

    public RouteLinkedList<Checkpoint> getRoute(String driverId) {

        RouteLinkedList<Checkpoint> list = new RouteLinkedList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM checkpoints WHERE driver_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, driverId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String type = rs.getString("type");

                Checkpoint cp;

                if (type.equals("Delivery")) {
                    cp = new DeliveryCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                } else if (type.equals("Fuel")) {
                    cp = new FuelCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                } else {
                    cp = new RestCheckpoint(
                            rs.getString("checkpoint_id"),
                            rs.getString("location_name"),
                            rs.getDouble("distance"),
                            rs.getInt("expected_duration"),
                            rs.getInt("actual_duration")
                    );
                }

                list.addCheckpoint(cp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}