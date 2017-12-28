// The reference goes out of scope permanently
void go() {
  Life z = new Life();
  // Reference 'z' dies at end of method
}

// The reference is assigned another object
Life z = new Life();
z = new Life();
// First object is abandoned when z is 'reprogrammed' to a new object

// The reference is explicitly set to null
Life z = new Life();
z = null;
// The first object is abandoned when z is 'deprogrammed'
