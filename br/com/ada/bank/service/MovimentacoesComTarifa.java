package br.com.ada.bank.service;
public interface MovimentacoesComTarifa {
  
  void sacarComTarifa(Double tarifa, Double valor);
  void transferirComTarifa(Double tarifa);

}