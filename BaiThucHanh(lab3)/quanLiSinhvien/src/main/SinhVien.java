package main;

import java.util.Objects;

public class SinhVien implements Comparable{
		private String maSinhVien;
		private String hoVaTen;
		private int namSinh;
		private float diemTrungBinh;
		
		
		public SinhVien(String maSinhVien) {
			this.maSinhVien = maSinhVien;
		}

		public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
			this.maSinhVien = maSinhVien;
			this.hoVaTen = hoVaTen;
			this.namSinh = namSinh;
			this.diemTrungBinh = diemTrungBinh;
		}

		public String getMaSinhVien() {
			return maSinhVien;
		}

		public void setMaSinhVien(String maSinhVien) {
			this.maSinhVien = maSinhVien;
		}

		public String getHoVaTen() {
			return hoVaTen;
		}

		public void setHoVaTen(String hoVaTen) {
			this.hoVaTen = hoVaTen;
		}

		public int getNamSinh() {
			return namSinh;
		}

		public void setNamSinh(int namSinh) {
			this.namSinh = namSinh;
		}

		public float getDiemTrungBinh() {
			return diemTrungBinh;
		}

		public void setDiemTrungBinh(float diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}

		
		
		@Override
		public String toString() {
			return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
					+ ", diemTrungBinh=" + diemTrungBinh + "]";
		}

		public int compareTo(SinhVien o) {
			return this.maSinhVien.compareTo(o.maSinhVien);
		}

		@Override
		public int hashCode() {
			return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SinhVien other = (SinhVien) obj;
			return Objects.equals(maSinhVien, other.maSinhVien);
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	}

