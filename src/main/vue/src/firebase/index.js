import firebase from 'firebase'

// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: 'AIzaSyD5DijMDq_7LfuoeljVcnJ_Uh1O03_ojP8',
  authDomain: 'twitter-clone-inflearn-76b0d.firebaseapp.com',
  projectId: 'twitter-clone-inflearn-76b0d',
  storageBucket: 'twitter-clone-inflearn-76b0d.appspot.com',
  messagingSenderId: '271721422575',
  appId: '1:271721422575:web:a690e68763aba8f5a5c51a',
  measurementId: 'G-9HH8ZRCW89',
}

firebase.initializeApp(firebaseConfig)

export const auth = firebase.auth()
export const db = firebase.firestore()
export const storage = firebase.storage()

export const USER_COLEECTION = db.collection('users')
export const TWEET_COLEECTION = db.collection('tweets')
export const COMMENT_COLLECTION = db.collection('comments')
export const RETWEET_COLLECTION = db.collection('retweets')
export const LIKE_COLLECTION = db.collection('likes')
export const MESSAGE_COLLECTION = db.collection('messages')
