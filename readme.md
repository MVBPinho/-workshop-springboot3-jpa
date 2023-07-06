## Deploy app to Heroku
# Heroku app dashboard -> Deploy
- heroku git:remote -a myapp
- git remote -v

# Setup Heroku app Config Vars
- DATABASE_URL
- JWT_EXPIRATION
- JWT_SECRET 

## Send to Heroku:
- git add .
- git commit -m "Deploy app to Heroku"
- git push heroku main 