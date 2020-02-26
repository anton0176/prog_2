const express = require('express')
const app = express()
const port = 420

app.use(express.json())
app.use(express.urlencoded())

app.get('/', (req, res) => {
  res.sendfile(__dirname + '\\hej.html')

})
app.get('/style', (req, res) => {
  res.sendfile(__dirname + '\\style.css')
})

app.get('/a', (req, res) => {
  res.sendfile(__dirname + '\\Black-Texture-Background-Images-HD.jpg')
})

app.post('/action_page', function (req, res) {
  console.log(req.body.b)
  res.redirect("/")
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))

