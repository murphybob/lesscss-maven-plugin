expected = """#test1 {
  background: url(test.png);
}
#test2 {
  content: "lorem ipsum dolor sit amet";
}
"""

css = new File(basedir, "target/test.css")
assert css.exists()
assert css.getText().equals(expected)
