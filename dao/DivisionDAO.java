package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Division;

public class DivisionDAO extends DAO<Division> {

		public Division create(Division obj) {
			try {
				 	PreparedStatement prepare = this.connect
	                                                .prepareStatement("INSERT INTO \"mvc\".Division VALUES(?, ?)"
	                                                    );
					prepare.setInt(1,obj.getCode());
					prepare.setString(2, obj.getLibelle());
					
					prepare.executeUpdate();
					obj = this.read(obj.getCode());	
					
				}
		    catch (SQLException e) {
		            e.printStackTrace();
		    }
		    return obj;
		}
		
		public Division read(int code) {
			Division laDivision = new Division();
			try {
	            ResultSet result = this .connect
	                                    .createStatement(
	                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                                                ResultSet.CONCUR_UPDATABLE)
	                                    .executeQuery("SELECT * FROM \"mvc\".Division WHERE code = '" + code +"'");
	            if(result.first())
	            		laDivision = new Division(code, result.getString("libelle"));   
			    } catch (SQLException e) {
			            e.printStackTrace();
			    }
			   return laDivision;
		}
		
		public List<Division> readAll() {
			List<Division> lesDivision = new ArrayList<Division>();
			try {
	            ResultSet result = this .connect
	                                    .createStatement(
	                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                                                ResultSet.CONCUR_UPDATABLE)
	                                    .executeQuery("SELECT * FROM \"mvc\".Division");
	            while(result.next()){
	            	Division uneDivision = new Division(result.getInt("code"), result.getString("libelle"));
	            	
	            	lesDivision.add(uneDivision);
	            }
	            
			    } catch (SQLException e) {
			            e.printStackTrace();
			    }
			   return lesDivision;
		}
		
		public Division update(Division obj) {
			try {
				
	                this .connect	
	                     .createStatement(
	                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                        ResultSet.CONCUR_UPDATABLE
	                     ).executeUpdate(
	                    	"UPDATE \"mvc\".Division SET libelle = '" + obj.getLibelle() + "'"+
	                    	" WHERE code = '" + obj.getCode()+"'"
	                     );
				
				obj = this.read(obj.getCode());
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		    
		    return obj;
		}


		public void delete(Division obj) {
			try {
				
	                this    .connect
	                    	.createStatement(
	                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
	                             ResultSet.CONCUR_UPDATABLE
	                        ).executeUpdate(
	                             "DELETE FROM \"mvc\".Division WHERE code = '" + obj.getCode()+"'"
	                        );
				
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		}
		
		

}