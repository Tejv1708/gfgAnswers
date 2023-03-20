
vector<int> getDistinctDifference(int N, vector<int> &A) {
        vector<int> ans(N) ;
        unordered_set<int> s1,s2 ;
        int i ;
        for(i=0 ; i< N ; i++){
           ans[i] = s1.size() ;
           cout << s1.size() << endl ;
           s1.insert(A[i]);
        }
        for(int i= N-1 ; i>=0 ; i--){
            ans[i] -= s2.size() ;
            s2.insert(A[i]) ;
        }
        return ans ;
    }