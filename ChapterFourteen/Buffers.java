BufferedWriter writer = new BufferedWriter( new Filewriter(AFile));

// When you want to send data BEFORE the buffer is full
writer.flush();
