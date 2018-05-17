class Comment < ActiveRecord::Base
	belongs_to :article

	validates :author, presence: { message: "Le commentaire doit avoir un auteur." }
	validates :content, presence: { message: "Le commentaire doit avoir du contenu." }
end