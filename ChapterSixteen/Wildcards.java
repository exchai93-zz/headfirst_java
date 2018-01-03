public void takeAnimals(ArrayList<? extends Animal> animals) {
  for(Animal a: animals) {
    a.eat();
  }
}
