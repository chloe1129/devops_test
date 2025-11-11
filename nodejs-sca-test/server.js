// server.js
const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.use(bodyParser.json());

app.get('/', (req, res) => {
  res.send('Node.js SCA Test Server is running.');
});

app.post('/data', (req, res) => {
  console.log('Received data:', req.body);
  res.send('Data received.');
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});