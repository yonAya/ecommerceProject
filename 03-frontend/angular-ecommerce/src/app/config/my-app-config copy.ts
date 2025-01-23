export default {
  oidc: {
    clientId: '', //public identifier
    issuer: '', //ussuer of tokens; url when authorising with Okta authorization Server
    redirectUri: 'https://localhost:4200/login/callback', //once user logs in... send them here
    scopes: ['openid', 'profile', 'email'], //scopes provide access to information about a user
  },
};
