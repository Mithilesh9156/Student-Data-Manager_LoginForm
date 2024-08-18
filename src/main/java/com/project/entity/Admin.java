package com.project.entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.Min;
	import jakarta.validation.constraints.Pattern;

	@Entity
	@Table(name = "admin")
	public class Admin {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Min(value = 6, message = "Id must be >=6")
		@Column(name = "Id")
		private int id;
		
		@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message = "Password must contain one capital letter, one special character and one integer value")                                  
		@Column(name ="password")
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Admin(@Min(value = 6, message = "Id must be >=6") int id,
				@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password must contain one capital letter, one special character and one integer value") String password) {
			super();
			this.id = id;
			this.password = password;
		}

		@Override
		public String toString() {
			return  " " + id + password;
		}
		
		
}

