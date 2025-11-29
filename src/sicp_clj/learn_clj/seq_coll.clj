(ns sicp-clj.learn-clj.seq-coll)

(def cards '(10 :ace :jack 9))

(first cards)
(rest cards)

(conj cards :queen)

(def stack '(:a :b))
(peek stack)
(pop stack)
