(ns sicp-clj.ch-1.gcd)

;; Iterative process
(defn gcd [a b]
  (if (= b 0)
   a
   (gcd b (mod a b))))

;; applicative-order eval
;; (gcd 206 40)
;; (gcd 40 (mod 206 40))
;; (gcd 40 6)
;; (gcd 6 (mod 40 6))
;; (gcd 6 4)
;; (gcd 4 (mod 6 4))
;; (gcd 4 2)
;; (gcd 2 (mod 4 2))
;; (gcd 2 0)
;; 2

;; normal-order eval
;; TODO
