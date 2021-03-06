package com.residencia.ecommerce.vo.Views;

import java.time.LocalDate;
import java.util.Calendar;

public class PedidoClienteView {
	
	private Integer numeroDoPedido;
	private double valorTotalDoPedido;
	private LocalDate dataDoPedido;
	private String status;
	private ProdutoPedidoView produtoPedidoView;
	
	public Integer getNumeroDoPedido() {
		return numeroDoPedido;
	}
	public void setNumeroDoPedido(Integer numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}
	public double getValorTotalDoPedido() {
		return valorTotalDoPedido;
	}
	public void setValorTotalDoPedido(double valorTotalDoPedido) {
		this.valorTotalDoPedido = valorTotalDoPedido;
	}
	public LocalDate getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(LocalDate dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public ProdutoPedidoView getProdutoPedidoView() {
		return produtoPedidoView;
	}
	public void setProdutoPedidoView(ProdutoPedidoView produtoPedidoView) {
		this.produtoPedidoView = produtoPedidoView;
	}
	
	
}
