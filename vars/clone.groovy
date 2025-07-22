def call(String url , String branch){
  echo  "This is code stage"
  git url: "${url}", branch: "${branch}"
  echo "Code clone successfully "
}
