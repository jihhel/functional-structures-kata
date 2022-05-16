package io.jihhel.kata

trait Storage[A] {
  def flush(a: A): Unit
}
