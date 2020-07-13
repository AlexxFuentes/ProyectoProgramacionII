package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: Depositos
 * Descripcion: Deposito que realizara el usuario.
 * 
 * */

public class Depositos {
	 private TipoCuenta _tipoCuenta;
     private double _monto;
     private Usuario _usuario;
     private CuentaBancaria _cuentaBancaria;
     
	public Depositos() {
		super();
	}

	public Depositos(TipoCuenta tipoCuenta, double monto, Usuario usuario, CuentaBancaria cuentaBancaria) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._monto = monto;
		this._usuario = usuario;
		this._cuentaBancaria = cuentaBancaria;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public double get_monto() {
		return _monto;
	}

	public void set_monto(double _monto) {
		this._monto = _monto;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public CuentaBancaria get_cuentaBancaria() {
		return _cuentaBancaria;
	}

	public void set_cuentaBancaria(CuentaBancaria _cuentaBancaria) {
		this._cuentaBancaria = _cuentaBancaria;
	}

	@Override
	public String toString() {
		return "Depositos [_tipoCuenta=" + _tipoCuenta + ", _monto=" + _monto + ", _usuario=" + _usuario
				+ ", _cuentaBancaria=" + _cuentaBancaria + "]";
	}
	
	
     
     
     
     
}
